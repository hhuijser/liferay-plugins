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

package com.liferay.calendar.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.calendar.service.CalendarImporterLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Eduardo Lundgren
 * @generated
 */
@ProviderType
public class CalendarImporterLocalServiceClpInvoker {
	public CalendarImporterLocalServiceClpInvoker() {
		_methodName154 = "getBeanIdentifier";

		_methodParameterTypes154 = new String[] {  };

		_methodName155 = "setBeanIdentifier";

		_methodParameterTypes155 = new String[] { "java.lang.String" };

		_methodName158 = "adjustCalExpandoTable";

		_methodParameterTypes158 = new String[] { "long" };

		_methodName159 = "importCalEvent";

		_methodParameterTypes159 = new String[] {
				"com.liferay.portlet.calendar.model.CalEvent"
			};

		_methodName160 = "importCalEvents";

		_methodParameterTypes160 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName154.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes154, parameterTypes)) {
			return CalendarImporterLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName155.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes155, parameterTypes)) {
			CalendarImporterLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName158.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes158, parameterTypes)) {
			CalendarImporterLocalServiceUtil.adjustCalExpandoTable(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName159.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes159, parameterTypes)) {
			CalendarImporterLocalServiceUtil.importCalEvent((com.liferay.portlet.calendar.model.CalEvent)arguments[0]);

			return null;
		}

		if (_methodName160.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes160, parameterTypes)) {
			CalendarImporterLocalServiceUtil.importCalEvents();

			return null;
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName154;
	private String[] _methodParameterTypes154;
	private String _methodName155;
	private String[] _methodParameterTypes155;
	private String _methodName158;
	private String[] _methodParameterTypes158;
	private String _methodName159;
	private String[] _methodParameterTypes159;
	private String _methodName160;
	private String[] _methodParameterTypes160;
}