package Check15.ex07;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();
        for(Board board : list){
            System.out.println(board.getTitle()+"-"+board.getContent());
        }
    }
}

class BoardDao {

    public List<Board> getBoardList() {
        List<Board> boardList = new ArrayList<>();

        boardList.add(new Board("제목1","내용1"));
        boardList.add(new Board("제목2","내용2"));
        boardList.add(new Board("제목3","내용3"));
        return boardList;
    }
}
