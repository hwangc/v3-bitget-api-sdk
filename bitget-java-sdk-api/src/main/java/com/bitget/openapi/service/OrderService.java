package com.bitget.openapi.service;

import com.bitget.openapi.dto.request.*;
import com.bitget.openapi.dto.response.*;

import java.io.IOException;
import java.util.List;

/**
 * 订单服务
 *
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public interface OrderService {
    /**
     * 下单
     *
     * @param orderRequest
     * @return
     * @throws IOException
     */
    PlaceOrderResult placeOrder(OrderReq orderRequest) throws IOException;

    /**
     * 批量下单
     *
     * @param placeBatchOrderReq
     * @return
     * @throws IOException
     */
    PlaceBatchOrderResult batchOrders(PlaceBatchOrderReq placeBatchOrderReq) throws IOException;

    /**
     * 取消订单
     *
     * @param symbol
     * @param orderId
     * @return
     * @throws IOException
     */
    CancelOrderResult cancelOrder(String symbol, String orderId) throws IOException;

    /**
     * 批量撤单
     *
     * @param symbol
     * @param param
     * @return
     * @throws IOException
     */
    CancelBatchOrderResult cancelBathOrders(String symbol, CancelBatchOrdersReq param) throws IOException;

    /**
     * 获取单订单信息
     *
     * @param symbol
     * @param orderId
     * @return
     * @throws IOException
     */
    Order getOrderDetail(String symbol, String orderId) throws IOException;

    /**
     * 获取订单列表
     *
     * @param symbol
     * @return
     * @throws IOException
     */
    List<Order> getOrders(String symbol, Integer status,
                          String from,
                          String to,
                          String limit) throws IOException;

    /**
     * 查询成交明细
     *
     * @param symbol
     * @param orderId
     * @return
     * @throws IOException
     */
    List<Fill> getFills(String symbol, String orderId) throws IOException;

    /**
     * 计划委托下单
     *
     * @param planPlaceOrderReq
     * @return
     * @throws IOException
     */
    PlanPlaceOrderResult planOrder(PlanPlaceOrderReq planPlaceOrderReq) throws IOException;

    /**
     * 计划委托撤单
     *
     * @param symbol
     * @param orderId
     * @return
     * @throws IOException
     */
    CancelPlanResult cancelPlan(String symbol, String orderId) throws IOException;

    /**
     * 查询当前计划委托
     *
     * @param symbol
     * @param planOrderReq
     * @return
     * @throws IOException
     */
    PlansOrderResult currentPlan(String symbol, PlanOrderReq planOrderReq) throws IOException;

    /**
     * 查询计划历史委托
     *
     * @param symbol
     * @param planOrderReq
     * @return
     * @throws IOException
     */
    PlansOrderResult historyPlan(String symbol, PlanOrderReq planOrderReq) throws IOException;
}