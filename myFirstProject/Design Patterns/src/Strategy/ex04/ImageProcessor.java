package Strategy.ex04;

public class ImageProcessor {

    private ImageFilterStrategy imageFilterStrategy;


    public ImageProcessor(ImageFilterStrategy imageFilterStrategy) {
        this.imageFilterStrategy = imageFilterStrategy;
    }


   public void applyFilter(){


        imageFilterStrategy.applyFilter();
   }
}
