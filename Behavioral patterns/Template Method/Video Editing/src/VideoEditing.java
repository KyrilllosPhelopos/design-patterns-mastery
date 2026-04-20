public abstract class  VideoEditing {

    public void enhancingVideoQuality(Video video)
    {
        System.out.println("Enhancing Video Quality....");
        return ;
    }

    public void enhancingAudioQuality(Video video)
    {
        System.out.println("Enhancing Audio Quality....");
        return ;
    }

    public void applyingColorCorrelation(Video video , String ColorCorrelation )
    {
        System.out.printf("Applying %s Color Correlation... ", ColorCorrelation);
    }

    public void applyFilter(Video video , String filter )
    {
        System.out.printf("Applying the following Filter: %s ... ", filter);
    }

    public abstract void RenderVideo();


}
