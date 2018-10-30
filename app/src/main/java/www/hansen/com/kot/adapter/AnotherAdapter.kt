package www.hansen.com.kot.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import www.hansen.com.kot.kids.TypeNotBindException

/**
 * 创建者 by ${HanSir} on 2018/10/29.
 * 版权所有  WELLTRANS.
 * 说明
 */
class AnotherAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var inflate : LayoutInflater? = null
    val items = ArrayList<Any>();
    val types = arrayListOf<Class<*>>()
    val binders = arrayListOf<ItmeBinder<*,*>>()

    fun with(clazz: Class<*>,binder: ItmeBinder<*,*>) : AnotherAdapter {
        if (types.contains(clazz)) {
            val index = types.indexOf(clazz)
            types.removeAt(index)
            binders.removeAt(index)
        }
        types += clazz
        binders += binder
        return this
    }
    //更新
    fun upDate(newDate : List<Any>) {
        items.clear()
        items.addAll(newDate)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        holder?.let {
            val type = getItemViewType(position)
            val binder = binders[type]
            val item = items[position]

            binder.adapter = this

            binder.itemClickListener?.let {
                holder.itemView.setOnClickListener {
                    (binder.itemClickListener as (item:Any,position: Int) -> Unit)
                            .invoke(item,holder.adapterPosition)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        if (parent == null) throw IllegalStateException("an adapter must attach a recycler")
        val binder = binders[viewType]
        inflate?.let { inflate = LayoutInflater.from(parent.context) }
        val holder = (binder as ItmeBinder<Any,RecyclerView.ViewHolder>)
                .createViewHolder(inflate ?: LayoutInflater.from(parent.context),parent)
        return holder
    }


    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
         return  items.size
    }

    override fun getItemViewType(position: Int): Int {
        val item = items[position]
        val type = types.indexOf(item.javaClass)
        if (type == -1) throw TypeNotBindException(
                "can not find binder of this type :${item.javaClass}")
        return type
    }
}