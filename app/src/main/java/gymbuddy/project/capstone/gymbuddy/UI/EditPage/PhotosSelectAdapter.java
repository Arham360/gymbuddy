package gymbuddy.project.capstone.gymbuddy.UI.EditPage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import gymbuddy.project.capstone.gymbuddy.R;


public class PhotosSelectAdapter extends BaseAdapter{

    Album album;
    Context context;

    PhotosSelectAdapter(Context context, Album album){
        this.context = context;
        this.album = album;
    }

    @Override
    public int getCount() {
        return album.getPictures().size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new GridView.LayoutParams(
                (int)context.getResources().getDimension(R.dimen.picture_size),
                (int)context.getResources().getDimension(R.dimen.picture_size)
        )); //dimension in px
        imageView.setBackgroundColor(context.getResources().getColor(R.color.colorGrey));
        Picasso.with(context)
                .load(album.getPictures().get(i).getURL()).into(imageView);
        return imageView;

    }
}
