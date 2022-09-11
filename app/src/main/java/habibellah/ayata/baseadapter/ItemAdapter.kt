package habibellah.ayata.baseadapter

class ItemAdapter (listOfItems: List<RecyclerItem>): BaseAdapterEx<RecyclerItem>(listOfItems) {

    override val layoutId = R.layout.recycler_item
}