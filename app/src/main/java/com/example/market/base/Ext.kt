package com.example.market.base

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.hannesdorfmann.adapterdelegates4.AbsDelegationAdapter

inline fun <reified T> attempt(func: () -> T): Either<Throwable, T> = try {
    Either.Right(func.invoke())
} catch (e: Throwable) {
    Either.Left(e)
}


/**
 * ext.Fun FragmentBindingDelegate
 */
fun <T : ViewBinding> Fragment.viewBinding(viewBindingFactory: (View) -> T) =
    FragmentBindingDelegate(this, viewBindingFactory)



//fun <T> AbsDelegationAdapter<T>.setData(data: T) {
//    items = data
//    notifyDataSetChanged()
//}
//
//fun RecyclerView.setAdapterAndCleanupOnDetachFromWindow(recyclerViewAdapter: RecyclerView.Adapter<*>) {
//    adapter = recyclerViewAdapter
//    addOnAttachStateChangeListener(object : View.OnAttachStateChangeListener {
//
//        override fun onViewAttachedToWindow(v: View?) {
//            adapter = null
//            removeOnAttachStateChangeListener(this)
//        }
//
//        override fun onViewDetachedFromWindow(v: View?) {
//        }
//    })
//}
//
//
//fun AppCompatActivity.checkSelfPermissionCompat(permission: String) =
//    ActivityCompat.checkSelfPermission(this, permission)
//
//fun AppCompatActivity.shouldShowRequestPermissionRationaleCompat(permission: String) =
//    ActivityCompat.shouldShowRequestPermissionRationale(this, permission)
//
//fun AppCompatActivity.requestPermissionsCompat(permissionsArray: Array<String>,
//                                               requestCode: Int) {
//    ActivityCompat.requestPermissions(this, permissionsArray, requestCode)
//}

