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

package com.liferay.testsearchcontainer.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.testsearchcontainer.NoSuchFooException;
import com.liferay.testsearchcontainer.model.Foo;
import com.liferay.testsearchcontainer.service.base.FooLocalServiceBaseImpl;

/**
 * The implementation of the foo local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.testsearchcontainer.service.FooLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Janghyun Kim
 * @see com.liferay.testsearchcontainer.service.base.FooLocalServiceBaseImpl
 * @see com.liferay.testsearchcontainer.service.FooLocalServiceUtil
 */
public class FooLocalServiceImpl extends FooLocalServiceBaseImpl {
	
	public void delete(long fooId) throws NoSuchFooException, SystemException {
		try {
			fooPersistence.remove(fooId);
		}
		catch (SystemException se) {
			throw se;
		}
		catch (NoSuchFooException nsfe) {
			throw nsfe;
		}
	}

	public void removeAll() throws SystemException {
		try {
			fooPersistence.removeAll();
		}
		catch (SystemException se) {
			throw se;
		}
	}

	public Foo addFoo(int value) throws SystemException {
		long fooId = counterLocalService.increment();

		Foo foo = fooPersistence.create(fooId);

		foo.setValue(value);

		fooPersistence.update(foo, false);

		return foo;
	}

	public Foo fetchByValue(int value)
		throws NoSuchFooException, SystemException {

		Foo foo = null;

		try {
			foo = fooPersistence.findByValue(value);
		}
		catch (SystemException se) {
			throw se;
		}
		catch (NoSuchFooException nsfe) {
			throw nsfe;
		}

		return foo;
	}

}