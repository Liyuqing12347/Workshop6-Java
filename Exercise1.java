public class Exercise1 {
    public static void main(String[] args) {
        //10首歌曲
        String[] songs = {
                "Hello", "Shape of You", "Perfect", "Believer", "Counting Stars",
                "Photograph", "Stay", "Blinding Lights", "Watermelon Sugar", "Bad Guy"
        };
        //对应10个歌手，顺序一一对应
        String[] artists = {
                "Adele", "Ed Sheeran", "Ed Sheeran", "Imagine Dragons", "OneRepublic",
                "Ed Sheeran", "The Kid LAROI", "The Weeknd", "Harry Styles", "Billie Eilish"
        };

        //循环打印歌曲+歌手
        for(int i = 0; i < songs.length; i++){
            System.out.println("Song: " + songs[i] + " | Artist: " + artists[i]);
        }
    }
}
