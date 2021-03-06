package org.greenscape.core.model;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Sheikh Sajid
 *
 */
public interface DocumentModel {
	/**
	 * The name of the internal database id
	 */
	String ID = "id";
	/**
	 * Name of the identifier property
	 */
	String MODEL_ID = "modelId";

	/**
	 * Get the internal id defined by the database, if available, otherwise
	 * returns the modelId. Some database like OrientDB and MongoDB provides its
	 * own id for every document instance
	 *
	 * @return the internal id or the modelId
	 */
	Object getId();

	/**
	 * Sets the internal id provided by the database or the modelId
	 *
	 * @param id
	 *            the internal database id
	 * @return this model instance
	 */
	DocumentModel setId(Object id);

	/**
	 * Gets the UUID of the model
	 *
	 * @return the UUID value
	 */
	String getModelId();

	/**
	 * Sets the UUID of the model
	 *
	 * @param modelId
	 *            the UUID to set
	 * @return this model instance
	 */
	DocumentModel setModelId(String modelId);

	/**
	 * Gets the value of the property given by name
	 *
	 * @param name
	 *            the property's name
	 * @return the value of the property
	 */
	Object getProperty(String name);

	/**
	 * Gets the value of the property given by name in a type safe manner
	 * @param name
	 *            the property's name
	 * @param clazz
	 *            the class type of the returned object
	 *
	 * @return the value of the property
	 */
	<T> T getProperty(String name, Class<T> clazz);

	/**
	 * Sets the value of the property in this entity given by name
	 *
	 * @param name
	 *            the property's name
	 * @param value
	 *            the value to set for the property
	 * @return the entity object itself for method chaining
	 */
	DocumentModel setProperty(String name, Object value);

	/**
	 * Gets the number of properties in this entity
	 *
	 * @return the number of properties
	 */
	int getPropertySize();

	/**
	 * Gets all the properties as a Key-Value pair
	 *
	 * @return the map of properties
	 */
	Map<String, Object> getProperties();

	/**
	 * Gets all the property names in this entity
	 *
	 * @return the set of property names
	 */
	Set<String> getPropertyNames();

	/**
	 * Gets all the property values in this entity
	 *
	 * @return the collection of property values
	 */
	Collection<Object> getPropertyValues();

}