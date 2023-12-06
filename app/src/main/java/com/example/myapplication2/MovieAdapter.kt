package com.example.myapplication2

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.databinding.MovieItemBinding

class MovieAdapter: RecyclerView.Adapter<MovieAdapter.MovieHolder>()  {
    val movieList = ArrayList<Movie>()
    class MovieHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = MovieItemBinding.bind(item)

        fun bind(movie: Movie) = with(binding){
            iv2.setImageResource(movie.imageID)
            tvTitle.text= movie.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        return MovieHolder(view )
    }

    override fun getItemCount(): Int {
        return  movieList.size
    }

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {
        holder. bind(movieList[position])
    }

    fun addMovie(movie: Movie) {
        movieList.add(movie)
        notifyDataSetChanged()
    }

}