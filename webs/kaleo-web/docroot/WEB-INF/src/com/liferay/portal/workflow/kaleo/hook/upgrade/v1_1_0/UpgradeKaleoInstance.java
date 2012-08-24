/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.workflow.kaleo.hook.upgrade.v1_1_0;

import com.liferay.portal.kernel.dao.jdbc.DataAccess;
import com.liferay.portal.kernel.upgrade.UpgradeProcess;
import com.liferay.portal.workflow.kaleo.util.WorkflowContextUtil;

import java.io.Serializable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Map;

import org.jabsorb.JSONSerializer;

/**
 * @author Janghyun Kim
 */
public class UpgradeKaleoInstance extends UpgradeProcess {

	@Override
	protected void doUpgrade() throws Exception {
		JSONSerializer jsonSerializer = new JSONSerializer();

		jsonSerializer.registerDefaultSerializers();

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = DataAccess.getConnection();

			ps = con.prepareStatement(
					"select kaleoInstanceId, workflowContext from " +
						"KaleoInstance where workflowContext is not null or " +
							"workflowContext !='' and workflowContext not " +
								"like '%serializable%'");

			rs = ps.executeQuery();

			while (rs.next()) {
				long kaleoInstanceId = rs.getLong("kaleoInstanceId");
				String workflowContext = rs.getString("workflowContext");

				String newWorkflowContext = WorkflowContextUtil.convert(
						(Map<String, Serializable>)jsonSerializer.fromJSON(
							workflowContext));

				upgradeWorkflowContext(newWorkflowContext, kaleoInstanceId);
			}
		}
		finally {
			DataAccess.cleanUp(con, ps, rs);
		}
	}

	protected void upgradeWorkflowContext(
			String workflowContext, long kaleoInstanceId)
		throws Exception {

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DataAccess.getConnection();

			ps = con.prepareStatement(
				"update KaleoInstance set workflowContext = ? where " +
					"kaleoInstanceId = ?");

			ps.setString(1, workflowContext);
			ps.setLong(2, kaleoInstanceId);

			ps.executeUpdate();
		}
		finally {
			DataAccess.cleanUp(con, ps);
		}
	}

}