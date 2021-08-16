package com.milotnt.pojo;

/**
 * @author ZhangMing [1157038410@qq.com]
 * @date 2021/8/10
 */
public class Member {

    private Integer memberId;
    private Integer memberAccount;
    private String memberPassword;
    private String memberName;
    private String memberGender;
    private Integer memberAge;
    private Integer memberHeight;
    private Integer memberWeight;
    private Long memberPhone;
    private Integer cardId;
    private String cardTime;
    private Integer cardClass;
    private Integer cardNextClass;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(Integer memberAccount) {
        this.memberAccount = memberAccount;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberGender() {
        return memberGender;
    }

    public void setMemberGender(String memberGender) {
        this.memberGender = memberGender;
    }

    public Integer getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(Integer memberAge) {
        this.memberAge = memberAge;
    }

    public Integer getMemberHeight() {
        return memberHeight;
    }

    public void setMemberHeight(Integer memberHeight) {
        this.memberHeight = memberHeight;
    }

    public Integer getMemberWeight() {
        return memberWeight;
    }

    public void setMemberWeight(Integer memberWeight) {
        this.memberWeight = memberWeight;
    }

    public Long getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(Long memberPhone) {
        this.memberPhone = memberPhone;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getCardTime() {
        return cardTime;
    }

    public void setCardTime(String cardTime) {
        this.cardTime = cardTime;
    }

    public Integer getCardClass() {
        return cardClass;
    }

    public void setCardClass(Integer cardClass) {
        this.cardClass = cardClass;
    }

    public Integer getCardNextClass() {
        return cardNextClass;
    }

    public void setCardNextClass(Integer cardNextClass) {
        this.cardNextClass = cardNextClass;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberAccount=" + memberAccount +
                ", memberPassword='" + memberPassword + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberGender='" + memberGender + '\'' +
                ", memberAge=" + memberAge +
                ", memberHeight=" + memberHeight +
                ", memberWeight=" + memberWeight +
                ", memberPhone=" + memberPhone +
                ", cardId=" + cardId +
                ", cardTime='" + cardTime + '\'' +
                ", cardClass=" + cardClass +
                ", cardNextClass=" + cardNextClass +
                '}';
    }
}
