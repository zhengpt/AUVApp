package com.zzz.auvapp.logic.network

import com.zzz.common.ext.await
import com.zzz.common.net.RequestServiceCreator

/**
 * <pre>
 *     author : zheng
 *     e-mail :
 *     time   : 2021/01/02
 *     desc   :
 *     version: 1.0
 * </pre>
 */
object EyeNetWork {

    private val eyeService = RequestServiceCreator.create(EyeService::class.java)


    suspend fun getHomeRecommoned(url: String) = eyeService.getHomePageRecommend(url).await()

}