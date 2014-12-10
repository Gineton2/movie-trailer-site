// BlueJ project: lesson7/gallery8

import java.util.ArrayList;

public class ListOfPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("degas1.jpg"));
        gallery.add(new Picture("gaugin1.jpg"));
        gallery.add(new Picture("monet1.jpg"));
        gallery.add(new Picture("monet2.jpg"));
        gallery.add(new Picture("renoir1.jpg"));

        int i = 0;
        boolean found = false;
        while (!found && i < gallery.size())
        {
            // checks if ith galley object is a Portrait, else increment i
            if (gallery.get(i).getHeight() > gallery.get(i).getWidth())
            {
                found = true;
            }
            else
            {
                i++;
            }
        }

        if (found)
        {
            gallery.get(i).draw();
        }
    }
}
