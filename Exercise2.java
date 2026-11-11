public class Exercise2 {
    public static void main(String[] args) {
        String[] songs = {
                "Hello", "Shape of You", "Perfect", "Believer", "Counting Stars",
                "Photograph", "Stay", "Blinding Lights", "Watermelon Sugar", "Bad Guy"
        };
        String[] artists = {
                "Adele", "Ed Sheeran", "Ed Sheeran", "Imagine Dragons", "OneRepublic",
                "Ed Sheeran", "The Kid LAROI", "The Weeknd", "Harry Styles", "Billie Eilish"
        };

        //冒泡排序，同时交换歌曲和歌手
        for(int i = 0; i < songs.length -1; i++){
            for(int j = 0; j < songs.length - 1 - i; j++){
                if(songs[j].compareTo(songs[j+1]) > 0){
                    //交换歌曲
                    String tempSong = songs[j];
                    songs[j] = songs[j+1];
                    songs[j+1] = tempSong;
                    //同步交换歌手
                    String tempArtist = artists[j];
                    artists[j] = artists[j+1];
                    artists[j+1] = tempArtist;
                }
            }
        }
        System.out.println("=====Sorted Alphabetically=====");
        for(int i = 0; i < songs.length; i++){
            System.out.println("Song: " + songs[i] + " | Artist: " + artists[i]);
        }
    }
}
