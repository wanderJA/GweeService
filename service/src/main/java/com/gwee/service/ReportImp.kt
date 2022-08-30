package com.gwee.service

import android.util.Log
import com.google.auto.service.AutoService
import com.idea.report.IReport

/**
 * Copyright (c) 2022 TTXS. All rights reserved.
 * 类功能描述:
 *
 * @author wangdou
 * @date 2022/8/30
 */
@AutoService(value = [IReport::class])
class ReportImp : IReport {
    override fun report() {
        Log.d("kapt", "report impl")
    }
}