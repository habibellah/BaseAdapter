package habibellah.ayata.baseadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import habibellah.ayata.baseadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        setUpAdapter()

    }

    //this method prepare the adapter of items
    private fun setUpAdapter() {
            val adapter = ItemAdapter(getListOfItems())
            binding.itemsRecycling.adapter = adapter
    }

    private fun getListOfItems(): List<RecyclerItem> {

        return mutableListOf(
            RecyclerItem("solid principles"),
            RecyclerItem("android"),
            RecyclerItem("programming"),
            RecyclerItem("design pattern"),
            RecyclerItem("software engineer "),
            RecyclerItem("software development"),
            RecyclerItem("TDD"),
        )
    }
}