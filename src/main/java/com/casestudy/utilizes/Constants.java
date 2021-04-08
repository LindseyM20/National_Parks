package com.casestudy.utilizes;

public class Constants {
	public final String PARKS_QUERY = "select p from Park p";
	public final String BB_QUERY = "select bb from Bucket_Been bb where bb.primaryKey.user_id = ";
	public final String BB_QUERY_VISITED = " and bb.visited = 1";
	public final String BB_QUERY_UNVISITED = " and bb.visited = 0";
}
