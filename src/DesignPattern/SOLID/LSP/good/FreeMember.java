package DesignPattern.SOLID.LSP.good;

public class FreeMember implements TournamentJoiner {
    private final String name;

    public FreeMember(String name){
        this.name = name;
    }

    @Override
    public void joinTournament() {
        System.out.println("일반회원이 토너먼트에 참가합니다.");
    }  
}
