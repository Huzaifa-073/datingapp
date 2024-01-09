package com.example.dating;

class LikesModel {
    int matchImage;
    String matchNameAge;
    int crossImage;
    int likeImage;

    public LikesModel(int matchImage, String matchNameAge, int crossImage, int likeImage) {
        this.matchImage = matchImage;
        this.matchNameAge = matchNameAge;
        this.crossImage = crossImage;
        this.likeImage = likeImage;
    }

    public int getMatchImage() {
        return matchImage;
    }

    public void setMatchImage(int matchImage) {
        this.matchImage = matchImage;
    }

    public String getMatchNameAge() {
        return matchNameAge;
    }

    public void setMatchNameAge(String matchNameAge) {
        this.matchNameAge = matchNameAge;
    }

    public int getCrossImage() {
        return crossImage;
    }

    public void setCrossImage(int crossImage) {
        this.crossImage = crossImage;
    }

    public int getLikeImage() {
        return likeImage;
    }

    public void setLikeImage(int likeImage) {
        this.likeImage = likeImage;
    }
}