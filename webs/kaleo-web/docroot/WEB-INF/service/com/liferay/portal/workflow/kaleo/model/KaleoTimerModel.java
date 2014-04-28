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

package com.liferay.portal.workflow.kaleo.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the KaleoTimer service. Represents a row in the &quot;KaleoTimer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoTimerModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoTimerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoTimer
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoTimerImpl
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoTimerModelImpl
 * @generated
 */
public interface KaleoTimerModel extends BaseModel<KaleoTimer>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a kaleo timer model instance should use the {@link KaleoTimer} interface instead.
	 */

	/**
	 * Returns the primary key of this kaleo timer.
	 *
	 * @return the primary key of this kaleo timer
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this kaleo timer.
	 *
	 * @param primaryKey the primary key of this kaleo timer
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the kaleo timer ID of this kaleo timer.
	 *
	 * @return the kaleo timer ID of this kaleo timer
	 */
	public long getKaleoTimerId();

	/**
	 * Sets the kaleo timer ID of this kaleo timer.
	 *
	 * @param kaleoTimerId the kaleo timer ID of this kaleo timer
	 */
	public void setKaleoTimerId(long kaleoTimerId);

	/**
	 * Returns the group ID of this kaleo timer.
	 *
	 * @return the group ID of this kaleo timer
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this kaleo timer.
	 *
	 * @param groupId the group ID of this kaleo timer
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this kaleo timer.
	 *
	 * @return the company ID of this kaleo timer
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this kaleo timer.
	 *
	 * @param companyId the company ID of this kaleo timer
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this kaleo timer.
	 *
	 * @return the user ID of this kaleo timer
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this kaleo timer.
	 *
	 * @param userId the user ID of this kaleo timer
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this kaleo timer.
	 *
	 * @return the user uuid of this kaleo timer
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this kaleo timer.
	 *
	 * @param userUuid the user uuid of this kaleo timer
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this kaleo timer.
	 *
	 * @return the user name of this kaleo timer
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this kaleo timer.
	 *
	 * @param userName the user name of this kaleo timer
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this kaleo timer.
	 *
	 * @return the create date of this kaleo timer
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this kaleo timer.
	 *
	 * @param createDate the create date of this kaleo timer
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this kaleo timer.
	 *
	 * @return the modified date of this kaleo timer
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this kaleo timer.
	 *
	 * @param modifiedDate the modified date of this kaleo timer
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the kaleo class name of this kaleo timer.
	 *
	 * @return the kaleo class name of this kaleo timer
	 */
	@AutoEscape
	public String getKaleoClassName();

	/**
	 * Sets the kaleo class name of this kaleo timer.
	 *
	 * @param kaleoClassName the kaleo class name of this kaleo timer
	 */
	public void setKaleoClassName(String kaleoClassName);

	/**
	 * Returns the kaleo class p k of this kaleo timer.
	 *
	 * @return the kaleo class p k of this kaleo timer
	 */
	public long getKaleoClassPK();

	/**
	 * Sets the kaleo class p k of this kaleo timer.
	 *
	 * @param kaleoClassPK the kaleo class p k of this kaleo timer
	 */
	public void setKaleoClassPK(long kaleoClassPK);

	/**
	 * Returns the kaleo definition ID of this kaleo timer.
	 *
	 * @return the kaleo definition ID of this kaleo timer
	 */
	public long getKaleoDefinitionId();

	/**
	 * Sets the kaleo definition ID of this kaleo timer.
	 *
	 * @param kaleoDefinitionId the kaleo definition ID of this kaleo timer
	 */
	public void setKaleoDefinitionId(long kaleoDefinitionId);

	/**
	 * Returns the name of this kaleo timer.
	 *
	 * @return the name of this kaleo timer
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this kaleo timer.
	 *
	 * @param name the name of this kaleo timer
	 */
	public void setName(String name);

	/**
	 * Returns the blocking of this kaleo timer.
	 *
	 * @return the blocking of this kaleo timer
	 */
	public boolean getBlocking();

	/**
	 * Returns <code>true</code> if this kaleo timer is blocking.
	 *
	 * @return <code>true</code> if this kaleo timer is blocking; <code>false</code> otherwise
	 */
	public boolean isBlocking();

	/**
	 * Sets whether this kaleo timer is blocking.
	 *
	 * @param blocking the blocking of this kaleo timer
	 */
	public void setBlocking(boolean blocking);

	/**
	 * Returns the description of this kaleo timer.
	 *
	 * @return the description of this kaleo timer
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this kaleo timer.
	 *
	 * @param description the description of this kaleo timer
	 */
	public void setDescription(String description);

	/**
	 * Returns the duration of this kaleo timer.
	 *
	 * @return the duration of this kaleo timer
	 */
	public double getDuration();

	/**
	 * Sets the duration of this kaleo timer.
	 *
	 * @param duration the duration of this kaleo timer
	 */
	public void setDuration(double duration);

	/**
	 * Returns the scale of this kaleo timer.
	 *
	 * @return the scale of this kaleo timer
	 */
	@AutoEscape
	public String getScale();

	/**
	 * Sets the scale of this kaleo timer.
	 *
	 * @param scale the scale of this kaleo timer
	 */
	public void setScale(String scale);

	/**
	 * Returns the recurrence duration of this kaleo timer.
	 *
	 * @return the recurrence duration of this kaleo timer
	 */
	public double getRecurrenceDuration();

	/**
	 * Sets the recurrence duration of this kaleo timer.
	 *
	 * @param recurrenceDuration the recurrence duration of this kaleo timer
	 */
	public void setRecurrenceDuration(double recurrenceDuration);

	/**
	 * Returns the recurrence scale of this kaleo timer.
	 *
	 * @return the recurrence scale of this kaleo timer
	 */
	@AutoEscape
	public String getRecurrenceScale();

	/**
	 * Sets the recurrence scale of this kaleo timer.
	 *
	 * @param recurrenceScale the recurrence scale of this kaleo timer
	 */
	public void setRecurrenceScale(String recurrenceScale);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(KaleoTimer kaleoTimer);

	@Override
	public int hashCode();

	@Override
	public CacheModel<KaleoTimer> toCacheModel();

	@Override
	public KaleoTimer toEscapedModel();

	@Override
	public KaleoTimer toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}