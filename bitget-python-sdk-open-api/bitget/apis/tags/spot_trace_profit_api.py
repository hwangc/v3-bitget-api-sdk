# coding: utf-8

"""
    Bitget Open API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: 2.0.0
    Generated by: https://openapi-generator.tech
"""

from bitget.paths.api_spot_v1_trace_profit_profit_his_detail_list.post import SpotTraceProfitHisDetailList
from bitget.paths.api_spot_v1_trace_profit_profit_his_list.post import SpotTraceProfitHisList
from bitget.paths.api_spot_v1_trace_profit_total_profit_info.post import SpotTraceTotalProfitInfo
from bitget.paths.api_spot_v1_trace_profit_total_profit_list.post import SpotTraceTotalProfitList
from bitget.paths.api_spot_v1_trace_profit_wait_profit_detail_list.post import SpotTraceWaitProfitDetailList


class SpotTraceProfitApi(
    SpotTraceProfitHisDetailList,
    SpotTraceProfitHisList,
    SpotTraceTotalProfitInfo,
    SpotTraceTotalProfitList,
    SpotTraceWaitProfitDetailList,
):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    pass