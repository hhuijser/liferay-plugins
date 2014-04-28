/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.portal.workflow.kaleo.model.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken;
import com.liferay.portal.workflow.kaleo.service.KaleoTaskInstanceTokenLocalServiceUtil;

/**
 * The extended model base implementation for the KaleoTaskInstanceToken service. Represents a row in the &quot;KaleoTaskInstanceToken&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link KaleoTaskInstanceTokenImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoTaskInstanceTokenImpl
 * @see com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken
 * @generated
 */
public abstract class KaleoTaskInstanceTokenBaseImpl
	extends KaleoTaskInstanceTokenModelImpl implements KaleoTaskInstanceToken {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a kaleo task instance token model instance should use the {@link KaleoTaskInstanceToken} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			KaleoTaskInstanceTokenLocalServiceUtil.addKaleoTaskInstanceToken(this);
		}
		else {
			KaleoTaskInstanceTokenLocalServiceUtil.updateKaleoTaskInstanceToken(this);
		}
	}
}