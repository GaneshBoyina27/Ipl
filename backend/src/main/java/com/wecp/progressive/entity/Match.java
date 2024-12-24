package com.wecp.progressive.entity;
public class Match {
    private int matchId,firstTeamId,secondTeamId;
    private Date matchDate;
    private String venue,result,status;
    private int winnerTeamId;
    public int getMatchId() {
        return matchId;
    }
    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }
    public int getFirstTeamId() {
        return firstTeamId;
    }
    public void setFirstTeamId(int firstTeamId) {
        this.firstTeamId = firstTeamId;
    }
    public int getSecondTeamId() {
        return secondTeamId;
    }
    public void setSecondTeamId(int secondTeamId) {
        this.secondTeamId = secondTeamId;
    }
    public Date getMatchDate() {
        return matchDate;
    }
    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }
    public String getVenue() {
        return venue;
    }
    public void setVenue(String venue) {
        this.venue = venue;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getWinnerTeamId() {
        return winnerTeamId;
    }
    public void setWinnerTeamId(int winnerTeamId) {
        this.winnerTeamId = winnerTeamId;
    }
}