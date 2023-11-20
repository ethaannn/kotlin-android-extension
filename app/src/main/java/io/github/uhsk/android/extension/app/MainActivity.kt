/*
 * Copyright (C) 2022. sollyu
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package io.github.uhsk.android.extension.app

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import io.github.uhsk.android.extension.app.databinding.ActivityMainBinding
import io.github.uhsk.kit.android.dp2px
import io.github.uhsk.kit.android.px2dp
import io.github.uhsk.kit.android.px2sp
import io.github.uhsk.kit.android.sp2px
class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mViewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mViewBinding.root)
        mViewBinding.btnContextTest.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            mViewBinding.btnContextTest -> onClickButtonTest(v)
        }
    }

    private fun onClickButtonTest(view: View) {
//        this.startActivityForSystemByShutdown()
        println("系统版本= ".plus(Build.VERSION.SDK_INT))
        println("屏幕密度= ".plus(resources.displayMetrics.density))
        println("屏幕ScaleDensity= " .plus(resources.displayMetrics.scaledDensity))
        println("10 dp convert px = ".plus(10.dp2px()))
        println("10 sp convert px= ".plus(10.sp2px()))
        println("10 px convert dp= ".plus(10.px2dp()))
        println("10 px convert sp= ".plus(10.px2sp()))
    }
}
