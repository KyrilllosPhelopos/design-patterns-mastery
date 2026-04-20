//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Video FHD_video1 = new Video("FHD VIDEO" , "/videos/fhd");
    Video HD_video1 = new Video("HD VIDEO" , "/videos/hd");
    Video SD_video1 = new Video("SD VIDEO" , "/videos/sd");

    VideoEditing FHD_video = new FHDVideoEditing();
    VideoEditing HD_video = new HDVideoEditing();
    VideoEditing SD_video = new SDVideoEditing();


    FHD_video.applyFilter(FHD_video1 , "X");
    HD_video.applyFilter(HD_video1 , "Y" );
    SD_video.applyFilter(SD_video1 , "Z");

    FHD_video.RenderVideo();
    FHD_video.enhancingVideoQuality(FHD_video1);
    FHD_video.applyingColorCorrelation(FHD_video1, "blue");
    FHD_video.enhancingAudioQuality(FHD_video1);

    HD_video.RenderVideo();
    HD_video.enhancingVideoQuality(HD_video1);
    HD_video.applyingColorCorrelation(HD_video1, "blue");
    HD_video.enhancingAudioQuality(HD_video1);

    SD_video.RenderVideo();
    SD_video.enhancingVideoQuality(SD_video1);
    SD_video.applyingColorCorrelation(SD_video1, "blue");
    SD_video.enhancingAudioQuality(SD_video1);

}
