package org.mybatis.spring.cache.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.cache.CacheVersion;
import org.mybatis.spring.cache.OperateType;
import org.mybatis.spring.cache.RedisCache;
import org.mybatis.spring.cache.pojo.OrderdetailInfo;

import com.linda.common.mybatis.generator.annotation.Table;

/**
 * @author AutoGenerated by lindzh
 * 2015年11月20日 10:25
 */
@CacheVersion("v1.0")
@Table(name="orderdetail")
public interface OrderdetailInfoDao {

	@RedisCache(operate=OperateType.INSERT,refKey="id",refPrefix="orderdetail_")
	public int addOrderdetailInfo(OrderdetailInfo obj);

	@RedisCache(operate=OperateType.SELECT,key="id",prefix="orderdetail_",refKey="id",refPrefix="orderdetail_")
	public OrderdetailInfo getById(@Param("id")long id);
	
	@RedisCache(operate=OperateType.SELECT,key="user_id",prefix="orderdetail_getByTeamIdAndUserId_",refKey="id",refPrefix="orderdetail_")
	public OrderdetailInfo getByTeamIdAndUserId(@Param("team_id")long teamId, @Param("user_id")long userId);
	
	@RedisCache(operate=OperateType.UPDATE,refKey="id",refPrefix="orderdetail_")
	public int updateById(@Param("obj")OrderdetailInfo obj);
	
	@RedisCache(operate=OperateType.DELETE,refKey="id",refPrefix="orderdetail_")
	public int deleteById(@Param("id")long id);
	
	@RedisCache(operate=OperateType.SELECT,key="order_id",prefix="orderdetail_getListByOrderId_",refKey="id",refPrefix="orderdetail_")
	public List<OrderdetailInfo> getListByOrderId(@Param("order_id")long order_id);
	
	@RedisCache(operate=OperateType.SELECT,key="buyer_id",prefix="orderdetail_getByBuyerIdAndTeamIdAndAddTime_",refKey="id",refPrefix="orderdetail_")
	public List<OrderdetailInfo> getByBuyerIdAndTeamIdAndAddTime(@Param("buyer_id")String buyerId, @Param("team_id")long team_id, @Param("create_time")int createTime);
	
	@RedisCache(operate=OperateType.MULTISELECT,key="buyer_id",prefix="orderdetail_getByBuyerIdAndTeamIdAndAddTime_",refKey="id",refPrefix="orderdetail_")
	public List<OrderdetailInfo> getByBuyerIdAndTeamIdsAndAddTime(List<Map<String,Object>> params);

	@RedisCache(operate=OperateType.SELECT,key="openid",prefix="orderdetail_getByOpenIdAndTeamIdAndAddTime_",refKey="id",refPrefix="orderdetail_")
	public List<OrderdetailInfo> getByOpenIdAndTeamIdAndAddTime(@Param("openid")String openId, @Param("team_id")long team_id, @Param("create_time")int createTime);
	
	@RedisCache(operate=OperateType.MULTISELECT,key="openid",prefix="orderdetail_getByOpenIdAndTeamIdAndAddTime_",refKey="id",refPrefix="orderdetail_")
	public List<OrderdetailInfo> getByOpenIdAndTeamIdsAndAddTime(List<Map<String,Object>> params);
	
	@RedisCache(operate=OperateType.SELECT,key="user_id",prefix="orderdetail_getListByOrderUserIdAndUdidAndCreteTime_",refKey="id",refPrefix="orderdetail_")
	public List<OrderdetailInfo> getListByOrderUserIdAndUdidAndCreteTime(@Param("team_id")long teamId, @Param("user_id")long userId, @Param("udid")String udid, @Param("create_time")int createTime);
	
	@RedisCache(operate=OperateType.MULTISELECT,key="user_id",prefix="orderdetail_getListByOrderUserIdAndUdidAndCreteTime_",refKey="id",refPrefix="orderdetail_")
	public List<OrderdetailInfo> getListByOrderUserIdAndTeamidsAndUdidAndCreteTime(List<Map<String,Object>> params);
	
	@RedisCache(operate=OperateType.SELECT,key="user_id",prefix="orderdetail_getListByUserIdAndTeamIdAndCreteTime_",refKey="id",refPrefix="orderdetail_")
	public List<OrderdetailInfo> getListByUserIdAndTeamIdAndCreteTime(@Param("team_id")long teamId, @Param("user_id")long userId, @Param("create_time")int createTime);
	
	@RedisCache(operate=OperateType.MULTISELECT,key="user_id",prefix="orderdetail_getListByUserIdAndTeamIdAndCreteTime_",refKey="id",refPrefix="orderdetail_")
	public List<OrderdetailInfo> getListByUserIdAndTeamIdsAndCreteTime(List<Map<String,Object>> params);
	
	
	@RedisCache(operate=OperateType.SELECT,key="team_id",prefix="orderdetail_getByTeamIdUserIdAndUdid_",refKey="id",refPrefix="orderdetail_")
	public List<OrderdetailInfo> getByTeamIdUserIdAndUdid(@Param("team_id")long teamId, @Param("user_id")long userId, @Param("udid")String udid);
	
	@RedisCache(operate=OperateType.SELECT,key="distribution_id",prefix="orderdetail_getFbiListByDistributionIdAndExpectEndTimeAndState_",refKey="id",refPrefix="orderdetail_")
	public List<OrderdetailInfo> getFbiListByDistributionIdAndState(@Param("distribution_id")long distribution_id);

	@RedisCache(operate=OperateType.SELECT,key="partner_id",prefix="orderdetail_getListByPartnerId_", refKey="id",refPrefix="orderdetail_")
	public List<OrderdetailInfo> getListByPartnerId(@Param("partner_id")long partnerId, @Param("state")String state, @Param("limit")int limit,@Param("offset")int offset);

	@RedisCache(operate=OperateType.UPDATE,refKey="id",refPrefix="orderdetail_")
	public int updateSplitNumAndDistributionId(@Param("split_number")String split_number, @Param("id")long id, @Param("distribution_id")int distribution_id);
	
	@RedisCache(operate=OperateType.SELECT,key="split_number", prefix="orderdetail_getBySplitNumber_", refKey="id", refPrefix="orderdetail_")
	public List<OrderdetailInfo> getBySplitNumber(@Param("split_number")String split_number);
	
	@RedisCache(operate=OperateType.SELECT,key="user_id",prefix="orderdetail_getByUserIdAndActivityIdNotCancel_", refKey="id",refPrefix="orderdetail_")
	public List<OrderdetailInfo> getByUserIdAndActivityIdNotCancel(@Param("user_id")long userId, @Param("activity_id")long activityId);
	
	@RedisCache(operate=OperateType.SELECT,key="user_id",prefix="orderdetail_getByUserIdAndUdidAndActivityIdNotCancel_", refKey="id",refPrefix="orderdetail_")
	public List<OrderdetailInfo> getByUserIdAndUdidAndActivityIdNotCancel(@Param("user_id")long userId, @Param("activity_id")long activityId, @Param("udid")String udid);
	
	@RedisCache(operate=OperateType.SELECT,key="user_id",prefix="orderdetail_getByUserIdAndActivityIdAndCreateTimeNotCancel_", refKey="id",refPrefix="orderdetail_")
	public List<OrderdetailInfo> getByUserIdAndActivityIdAndCreateTimeNotCancel(@Param("user_id")long userId, @Param("activity_id")long activityId, @Param("create_time")int createTime);
	
	@RedisCache(operate=OperateType.SELECT,key="user_id",prefix="orderdetail_getByUserIdAndUdidAndActivityIdAndCreateTimeNotCancel_", refKey="id",refPrefix="orderdetail_")
	public List<OrderdetailInfo> getByUserIdAndUdidAndActivityIdAndCreateTimeNotCancel(@Param("user_id")long userId, @Param("activity_id")long activityId, @Param("create_time")int createTime, @Param("udid")String udid);
	
	@RedisCache(operate=OperateType.SELECT,key="openid",prefix="orderdetail_getByOpenidAndActivityIdNotCancel_", refKey="id",refPrefix="orderdetail_")
	public List<OrderdetailInfo> getByOpenidAndActivityIdNotCancel(@Param("openid")String openid, @Param("activity_id")long activityId);
	
	@RedisCache(operate=OperateType.SELECT,key="openid",prefix="orderdetail_getByOpenidAndActivityIdAndCreateTimeNotCancel_", refKey="id",refPrefix="orderdetail_")
	public List<OrderdetailInfo> getByOpenidAndActivityIdAndCreateTimeNotCancel(@Param("openid")String openid, @Param("activity_id")long activityId, @Param("create_time")int createTime);
	
	@RedisCache(operate=OperateType.SELECT,key="buyer_id",prefix="orderdetail_getByBuyerIdAndActivityIdNotCancel_", refKey="id",refPrefix="orderdetail_")
	public List<OrderdetailInfo> getByBuyerIdAndActivityIdNotCancel(@Param("buyer_id")String buyerId, @Param("activity_id")long activityId);
	
	@RedisCache(operate=OperateType.SELECT,key="buyer_id",prefix="orderdetail_getByBuyerIdAndActivityIdAndCreateTimeNotCancel_", refKey="id",refPrefix="orderdetail_")
	public List<OrderdetailInfo> getByBuyerIdAndActivityIdAndCreateTimeNotCancel(@Param("buyer_id")String buyerId, @Param("activity_id")long activityId, @Param("create_time")int createTime);
	
	@RedisCache(operate=OperateType.UPDATE,refKey="id",refPrefix="orderdetail_")
	public int updateStateById(@Param("state")String state, @Param("id")long id);
	
	@RedisCache(operate=OperateType.UPDATE,refKey="id",refPrefix="orderdetail_")
	public int updateStateAndOpenidById(@Param("state")String state,@Param("openid")String openid, @Param("id")long id);
	
	@RedisCache(operate=OperateType.UPDATE,refKey="id",refPrefix="orderdetail_")
	public int updateStateAndBuyIdById(@Param("state")String state,@Param("buyer_id")String buyerId, @Param("id")long id);
	
	@RedisCache(operate=OperateType.SELECT,key="team_id",prefix="orderdetail_getByTeamIdAndCreatTimeIsPayOrDelvering_", refKey="id",refPrefix="orderdetail_")
	public List<OrderdetailInfo> getByTeamIdAndCreatTimeIsPayOrDelvering(@Param("team_id")long team_id, @Param("create_time")int createTime);
}
