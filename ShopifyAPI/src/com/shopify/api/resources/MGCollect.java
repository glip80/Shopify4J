/**
* DO NOT MODIFY THIS CODE
* 
* Place all of your changes in Collect.java
* 
* It has been machine generated from fixtures and your changes will be
* lost if anything new needs to be added to the API. 
**/
// Last Generated: 2011-08-25T23:19:06-04:00
package com.shopify.api.resources;

import org.codehaus.jackson.annotate.JsonProperty;

/**
* This code has been machine generated by processing the single entry
* fixtures found from the Shopify API Documentation
*/
  
public class MGCollect extends ShopifyResource {

	@JsonProperty("position")
	private int _position;
	public int getPosition(){ return _position;}
	public void setPosition(int _position){_position = this._position;}

	@JsonProperty("product_id")
	private int _product_id;
	public int getProductId(){ return _product_id;}
	public void setProductId(int _product_id){_product_id = this._product_id;}

	@JsonProperty("featured")
	private boolean _featured;
	public boolean getFeatured(){ return _featured;}
	public void setFeatured(boolean _featured){_featured = this._featured;}

	@JsonProperty("collection_id")
	private int _collection_id;
	public int getCollectionId(){ return _collection_id;}
	public void setCollectionId(int _collection_id){_collection_id = this._collection_id;}

}