package DesignPattern.SOLID.LSP.bad;

public class FreeMember extends Member{
    public FreeMember(String name){
        super(name);
    }

    @Override
    public void joinTournament() {
        System.out.println("일반회원이 토너먼트에 참가합니다.");
    }

    // 불가능하다고 출력하는건 그저 예시일뿐
    @Override
    public void organizeTournament() {
        System.out.println("일반회원은 토너먼트를 주최할 수 없습니다.");
    }
    
}
