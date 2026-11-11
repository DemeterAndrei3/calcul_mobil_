package ro.visitmaramures

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.*

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showList()
    }

    private fun showList() {
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(32, 28, 32, 24)
        }
        layout.addView(TextView(this).apply {
            text = "Visit Maramureș\nObiective turistice"
            textSize = 26f
            gravity = Gravity.CENTER
            setPadding(0, 0, 0, 24)
        })
        val list = ListView(this)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,
            attractions.map { "${it.name}\n${it.location} • ${it.category}" })
        list.adapter = adapter
        list.setOnItemClickListener { _, _, position, _ -> showDetail(position) }
        layout.addView(list, LinearLayout.LayoutParams(-1, 0, 1f))
        setContentView(layout)
    }

    private fun showDetail(position: Int) {
        val item = attractions[position]
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(32, 28, 32, 24)
        }
        layout.addView(TextView(this).apply {
            text = item.name
            textSize = 26f
            setPadding(0, 0, 0, 12)
        })
        layout.addView(TextView(this).apply {
            text = "Categorie: ${item.category}\nLocalitate: ${item.location}\n\n${item.description}"
            textSize = 18f
        })
        layout.addView(Button(this).apply {
            text = "Înapoi la listă"
            setOnClickListener { showList() }
        })
        setContentView(layout)
    }
}
