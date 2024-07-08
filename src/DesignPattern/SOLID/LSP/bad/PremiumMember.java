package DesignPattern.SOLID.LSP.bad;

public class PremiumMember extends Member {
    public PremiumMember(String name){
        super(name);
    }

    @Override
    public void joinTournament() {
        System.out.println("프리미엄 회원이 토너먼트에 참가합니다.");
    }

    @Override
    public void organizeTournament() {
        System.out.println("프리미엄 회원이 토너먼트를 주최합니다.");
    }
    
}
