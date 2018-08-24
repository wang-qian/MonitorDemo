package com.foolchen.lib.tracker.data

/**
 * 日志输出&追踪的模式
 * @author chenchong
 * 2017/11/27
 * 上午11:44
 */
enum class TrackerMode {
    /**
     * 仅调试模式，数据不入库，可在后台实时追踪日志输出
     *
     * 该模式一般供开发人员使用，不要在上线时使用该模式
     */
    DEBUG_ONLY,
    /**
     * 调试&追踪模式，数据实时入库，并且可在后台实时追踪日志输出
     *
     * 该模式一般供测试人员使用
     */
    DEBUG_TRACK,
    /**
     * 发布模式，数据根据既定策略入库，并且无法在后台实时追踪日志输出
     *
     * 该模式为发布时使用的模式，不要在上线时使用该模式
     */
    RELEASE,

    /**
     * 禁用
     *
     * 该模式时，调用的任何方法都会失效
     */
    DISABLE
}