package com.anokmik.scala.sample

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import macroid.FullDsl._
import macroid._
import macroid.contrib.Layouts.VerticalLinearLayout

class Launcher extends Activity with Contexts[Activity] {
  override def onCreate(savedInstanceState: Bundle) = {
    super.onCreate(savedInstanceState)
    setContentView {
      getUi {
        l[VerticalLinearLayout](
          w[TextView] <~ text(R.string.hello_world)
        )
      }
    }
  }
}