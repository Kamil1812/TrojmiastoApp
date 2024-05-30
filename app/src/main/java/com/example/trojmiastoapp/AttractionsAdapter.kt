import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.trojmiastoapp.R

data class Attraction(val title: String, val description: String, val imageResId: Int)

class AttractionsAdapter(private val attractions: List<Attraction>) : RecyclerView.Adapter<AttractionsAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val attractionTitle: TextView = itemView.findViewById(R.id.textAttractionTitle)
        val attractionDescription: TextView = itemView.findViewById(R.id.textAttractionDescription)
        val imageAttraction: ImageView = itemView.findViewById(R.id.imageAttraction)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_attraction, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val attraction = attractions[position]
        holder.attractionTitle.text = attraction.title
        holder.attractionDescription.text = attraction.description
        holder.imageAttraction.setImageResource(attraction.imageResId)
    }

    override fun getItemCount(): Int {
        return attractions.size
    }
}
