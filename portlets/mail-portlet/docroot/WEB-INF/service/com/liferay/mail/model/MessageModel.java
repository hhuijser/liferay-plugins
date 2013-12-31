/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.mail.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.AuditedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Message service. Represents a row in the &quot;Mail_Message&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.mail.model.impl.MessageModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.mail.model.impl.MessageImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Message
 * @see com.liferay.mail.model.impl.MessageImpl
 * @see com.liferay.mail.model.impl.MessageModelImpl
 * @generated
 */
public interface MessageModel extends AuditedModel, BaseModel<Message> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a message model instance should use the {@link Message} interface instead.
	 */

	/**
	 * Returns the primary key of this message.
	 *
	 * @return the primary key of this message
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this message.
	 *
	 * @param primaryKey the primary key of this message
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the message ID of this message.
	 *
	 * @return the message ID of this message
	 */
	public long getMessageId();

	/**
	 * Sets the message ID of this message.
	 *
	 * @param messageId the message ID of this message
	 */
	public void setMessageId(long messageId);

	/**
	 * Returns the company ID of this message.
	 *
	 * @return the company ID of this message
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this message.
	 *
	 * @param companyId the company ID of this message
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this message.
	 *
	 * @return the user ID of this message
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this message.
	 *
	 * @param userId the user ID of this message
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this message.
	 *
	 * @return the user uuid of this message
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this message.
	 *
	 * @param userUuid the user uuid of this message
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this message.
	 *
	 * @return the user name of this message
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this message.
	 *
	 * @param userName the user name of this message
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this message.
	 *
	 * @return the create date of this message
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this message.
	 *
	 * @param createDate the create date of this message
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this message.
	 *
	 * @return the modified date of this message
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this message.
	 *
	 * @param modifiedDate the modified date of this message
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the account ID of this message.
	 *
	 * @return the account ID of this message
	 */
	public long getAccountId();

	/**
	 * Sets the account ID of this message.
	 *
	 * @param accountId the account ID of this message
	 */
	public void setAccountId(long accountId);

	/**
	 * Returns the folder ID of this message.
	 *
	 * @return the folder ID of this message
	 */
	public long getFolderId();

	/**
	 * Sets the folder ID of this message.
	 *
	 * @param folderId the folder ID of this message
	 */
	public void setFolderId(long folderId);

	/**
	 * Returns the sender of this message.
	 *
	 * @return the sender of this message
	 */
	@AutoEscape
	public String getSender();

	/**
	 * Sets the sender of this message.
	 *
	 * @param sender the sender of this message
	 */
	public void setSender(String sender);

	/**
	 * Returns the to of this message.
	 *
	 * @return the to of this message
	 */
	@AutoEscape
	public String getTo();

	/**
	 * Sets the to of this message.
	 *
	 * @param to the to of this message
	 */
	public void setTo(String to);

	/**
	 * Returns the cc of this message.
	 *
	 * @return the cc of this message
	 */
	@AutoEscape
	public String getCc();

	/**
	 * Sets the cc of this message.
	 *
	 * @param cc the cc of this message
	 */
	public void setCc(String cc);

	/**
	 * Returns the bcc of this message.
	 *
	 * @return the bcc of this message
	 */
	@AutoEscape
	public String getBcc();

	/**
	 * Sets the bcc of this message.
	 *
	 * @param bcc the bcc of this message
	 */
	public void setBcc(String bcc);

	/**
	 * Returns the sent date of this message.
	 *
	 * @return the sent date of this message
	 */
	public Date getSentDate();

	/**
	 * Sets the sent date of this message.
	 *
	 * @param sentDate the sent date of this message
	 */
	public void setSentDate(Date sentDate);

	/**
	 * Returns the subject of this message.
	 *
	 * @return the subject of this message
	 */
	@AutoEscape
	public String getSubject();

	/**
	 * Sets the subject of this message.
	 *
	 * @param subject the subject of this message
	 */
	public void setSubject(String subject);

	/**
	 * Returns the preview of this message.
	 *
	 * @return the preview of this message
	 */
	@AutoEscape
	public String getPreview();

	/**
	 * Sets the preview of this message.
	 *
	 * @param preview the preview of this message
	 */
	public void setPreview(String preview);

	/**
	 * Returns the body of this message.
	 *
	 * @return the body of this message
	 */
	@AutoEscape
	public String getBody();

	/**
	 * Sets the body of this message.
	 *
	 * @param body the body of this message
	 */
	public void setBody(String body);

	/**
	 * Returns the flags of this message.
	 *
	 * @return the flags of this message
	 */
	@AutoEscape
	public String getFlags();

	/**
	 * Sets the flags of this message.
	 *
	 * @param flags the flags of this message
	 */
	public void setFlags(String flags);

	/**
	 * Returns the size of this message.
	 *
	 * @return the size of this message
	 */
	public long getSize();

	/**
	 * Sets the size of this message.
	 *
	 * @param size the size of this message
	 */
	public void setSize(long size);

	/**
	 * Returns the remote message ID of this message.
	 *
	 * @return the remote message ID of this message
	 */
	public long getRemoteMessageId();

	/**
	 * Sets the remote message ID of this message.
	 *
	 * @param remoteMessageId the remote message ID of this message
	 */
	public void setRemoteMessageId(long remoteMessageId);

	/**
	 * Returns the attachment of this message.
	 *
	 * @return the attachment of this message
	 */
	public boolean getAttachment();

	/**
	 * Returns <code>true</code> if this message is attachment.
	 *
	 * @return <code>true</code> if this message is attachment; <code>false</code> otherwise
	 */
	public boolean isAttachment();

	/**
	 * Sets whether this message is attachment.
	 *
	 * @param attachment the attachment of this message
	 */
	public void setAttachment(boolean attachment);

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
	public int compareTo(Message message);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Message> toCacheModel();

	@Override
	public Message toEscapedModel();

	@Override
	public Message toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}