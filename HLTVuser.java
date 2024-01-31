class HLTVuser extends User {
    private String linkToProfile;
    HLTVuser(String nickname, String linkToProfile) {
        super(nickname);
        this.changeLink(linkToProfile);
    }
    public String getLink() {
        return this.linkToProfile;
    }
    public void changeLink(String linkToProfile) {
        this.linkToProfile = linkToProfile;
    }
}