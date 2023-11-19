package io.github.uhsk.kit.android.view

import android.view.View

/**
 * View是否显示 true 显示，false 不显示
 *
 * @since 1.0.2
 * @author ethan
 */
fun View.setVisible(isVisible: Boolean) {
    visibility = if (isVisible) {
        View.VISIBLE
    } else {
        View.GONE
    }
}

/**
 * Vie是否显示 0 显示，非0不显示
 * @since 1.0.2
 * @author ethan
 */
fun View.setVisible(visible: Int) {
    visibility = if (visible == 0) {
        View.VISIBLE
    } else {
        View.GONE
    }
}

/**
 * @since 1.0.2
 * @author ethan
 */
fun View.setInVisible(isVisible: Boolean) {
    visibility = if (isVisible) {
        View.VISIBLE
    } else {
        View.INVISIBLE
    }
}

/**
 * 0 可见 非0 不可见 但会占用空间
 * @since 1.0.2
 * @author ethan
 */
fun View.setInVisible(visible: Int) {
    visibility = if (visible == 0) {
        View.VISIBLE
    } else {
        View.INVISIBLE
    }
}
