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

package es.vass.ficha.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Jornada service. Represents a row in the &quot;FICHA_Jornada&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link es.vass.ficha.model.impl.JornadaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link es.vass.ficha.model.impl.JornadaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Jornada
 * @see es.vass.ficha.model.impl.JornadaImpl
 * @see es.vass.ficha.model.impl.JornadaModelImpl
 * @generated
 */
@ProviderType
public interface JornadaModel extends BaseModel<Jornada>, GroupedModel,
	ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a jornada model instance should use the {@link Jornada} interface instead.
	 */

	/**
	 * Returns the primary key of this jornada.
	 *
	 * @return the primary key of this jornada
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this jornada.
	 *
	 * @param primaryKey the primary key of this jornada
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this jornada.
	 *
	 * @return the uuid of this jornada
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this jornada.
	 *
	 * @param uuid the uuid of this jornada
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the jornada ID of this jornada.
	 *
	 * @return the jornada ID of this jornada
	 */
	public long getJornadaId();

	/**
	 * Sets the jornada ID of this jornada.
	 *
	 * @param jornadaId the jornada ID of this jornada
	 */
	public void setJornadaId(long jornadaId);

	/**
	 * Returns the group ID of this jornada.
	 *
	 * @return the group ID of this jornada
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this jornada.
	 *
	 * @param groupId the group ID of this jornada
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this jornada.
	 *
	 * @return the company ID of this jornada
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this jornada.
	 *
	 * @param companyId the company ID of this jornada
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this jornada.
	 *
	 * @return the user ID of this jornada
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this jornada.
	 *
	 * @param userId the user ID of this jornada
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this jornada.
	 *
	 * @return the user uuid of this jornada
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this jornada.
	 *
	 * @param userUuid the user uuid of this jornada
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this jornada.
	 *
	 * @return the user name of this jornada
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this jornada.
	 *
	 * @param userName the user name of this jornada
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this jornada.
	 *
	 * @return the create date of this jornada
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this jornada.
	 *
	 * @param createDate the create date of this jornada
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this jornada.
	 *
	 * @return the modified date of this jornada
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this jornada.
	 *
	 * @param modifiedDate the modified date of this jornada
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the fecha finalizacion of this jornada.
	 *
	 * @return the fecha finalizacion of this jornada
	 */
	public Date getFechaFinalizacion();

	/**
	 * Sets the fecha finalizacion of this jornada.
	 *
	 * @param fechaFinalizacion the fecha finalizacion of this jornada
	 */
	public void setFechaFinalizacion(Date fechaFinalizacion);

	/**
	 * Returns the latitud of this jornada.
	 *
	 * @return the latitud of this jornada
	 */
	public long getLatitud();

	/**
	 * Sets the latitud of this jornada.
	 *
	 * @param latitud the latitud of this jornada
	 */
	public void setLatitud(long latitud);

	/**
	 * Returns the longuitud of this jornada.
	 *
	 * @return the longuitud of this jornada
	 */
	public long getLonguitud();

	/**
	 * Sets the longuitud of this jornada.
	 *
	 * @param longuitud the longuitud of this jornada
	 */
	public void setLonguitud(long longuitud);

	/**
	 * Returns the horas asignadas of this jornada.
	 *
	 * @return the horas asignadas of this jornada
	 */
	public long getHorasAsignadas();

	/**
	 * Sets the horas asignadas of this jornada.
	 *
	 * @param horasAsignadas the horas asignadas of this jornada
	 */
	public void setHorasAsignadas(long horasAsignadas);

	/**
	 * Returns the tipo servicio of this jornada.
	 *
	 * @return the tipo servicio of this jornada
	 */
	public long getTipoServicio();

	/**
	 * Sets the tipo servicio of this jornada.
	 *
	 * @param tipoServicio the tipo servicio of this jornada
	 */
	public void setTipoServicio(long tipoServicio);

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
	public int compareTo(Jornada jornada);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Jornada> toCacheModel();

	@Override
	public Jornada toEscapedModel();

	@Override
	public Jornada toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}