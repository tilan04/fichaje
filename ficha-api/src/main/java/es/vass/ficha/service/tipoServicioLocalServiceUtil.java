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

package es.vass.ficha.service;

import aQute.bnd.annotation.ProviderType;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for tipoServicio. This utility wraps
 * {@link es.vass.ficha.service.impl.tipoServicioLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see tipoServicioLocalService
 * @see es.vass.ficha.service.base.tipoServicioLocalServiceBaseImpl
 * @see es.vass.ficha.service.impl.tipoServicioLocalServiceImpl
 * @generated
 */
@ProviderType
public class tipoServicioLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.vass.ficha.service.impl.tipoServicioLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the tipo servicio to the database. Also notifies the appropriate model listeners.
	*
	* @param tipoServicio the tipo servicio
	* @return the tipo servicio that was added
	*/
	public static es.vass.ficha.model.tipoServicio addtipoServicio(
		es.vass.ficha.model.tipoServicio tipoServicio) {
		return getService().addtipoServicio(tipoServicio);
	}

	/**
	* Creates a new tipo servicio with the primary key. Does not add the tipo servicio to the database.
	*
	* @param idTipoServicio the primary key for the new tipo servicio
	* @return the new tipo servicio
	*/
	public static es.vass.ficha.model.tipoServicio createtipoServicio(
		long idTipoServicio) {
		return getService().createtipoServicio(idTipoServicio);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the tipo servicio with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idTipoServicio the primary key of the tipo servicio
	* @return the tipo servicio that was removed
	* @throws PortalException if a tipo servicio with the primary key could not be found
	*/
	public static es.vass.ficha.model.tipoServicio deletetipoServicio(
		long idTipoServicio)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletetipoServicio(idTipoServicio);
	}

	/**
	* Deletes the tipo servicio from the database. Also notifies the appropriate model listeners.
	*
	* @param tipoServicio the tipo servicio
	* @return the tipo servicio that was removed
	*/
	public static es.vass.ficha.model.tipoServicio deletetipoServicio(
		es.vass.ficha.model.tipoServicio tipoServicio) {
		return getService().deletetipoServicio(tipoServicio);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.vass.ficha.model.impl.tipoServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.vass.ficha.model.impl.tipoServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static es.vass.ficha.model.tipoServicio fetchtipoServicio(
		long idTipoServicio) {
		return getService().fetchtipoServicio(idTipoServicio);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the tipo servicio with the primary key.
	*
	* @param idTipoServicio the primary key of the tipo servicio
	* @return the tipo servicio
	* @throws PortalException if a tipo servicio with the primary key could not be found
	*/
	public static es.vass.ficha.model.tipoServicio gettipoServicio(
		long idTipoServicio)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().gettipoServicio(idTipoServicio);
	}

	/**
	* Returns a range of all the tipo servicios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.vass.ficha.model.impl.tipoServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipo servicios
	* @param end the upper bound of the range of tipo servicios (not inclusive)
	* @return the range of tipo servicios
	*/
	public static java.util.List<es.vass.ficha.model.tipoServicio> gettipoServicios(
		int start, int end) {
		return getService().gettipoServicios(start, end);
	}

	/**
	* Returns the number of tipo servicios.
	*
	* @return the number of tipo servicios
	*/
	public static int gettipoServiciosCount() {
		return getService().gettipoServiciosCount();
	}

	/**
	* Updates the tipo servicio in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tipoServicio the tipo servicio
	* @return the tipo servicio that was updated
	*/
	public static es.vass.ficha.model.tipoServicio updatetipoServicio(
		es.vass.ficha.model.tipoServicio tipoServicio) {
		return getService().updatetipoServicio(tipoServicio);
	}

	public static tipoServicioLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<tipoServicioLocalService, tipoServicioLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(tipoServicioLocalService.class);

		ServiceTracker<tipoServicioLocalService, tipoServicioLocalService> serviceTracker =
			new ServiceTracker<tipoServicioLocalService, tipoServicioLocalService>(bundle.getBundleContext(),
				tipoServicioLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}