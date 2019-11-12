package music;

public class PersonalPlaylist extends Playlist {

    public void remove(Song song){
        getTracks().remove(song);
        getSingers().remove(song.getSinger()); // 추가 수정이 이루어져야 함.
    }
}
