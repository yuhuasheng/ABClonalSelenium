package com.dayang.domain;

import lombok.Data;

import java.util.Objects;

@Data
public class StandardTwoInfo {
    //序号
    private String number;
    //货号
    private String itemNumber;
    //名称
    private String name;
    //修订后的名称
    private String revisedName;
    //物种
    private String species;
    //类型
    private String type;
    //验证应用
    private String verifyApplication;
    //反应物种
    private String reactiveSpecies;
    //Price(50ul)
    private String price50ul;
    //Price(100ul)
    private String price100ul;
    //Price(200ul)
    private String price200ul;
    //用户验证的应用
    private String userAuthenticationApplication;
    //推荐稀释比&实验步骤
    private String recommendedDilutionRatio;
    //同种型
    private String isotype;
    //链接
    private String link;
    //背景
    private String background;
    //免疫原
    private String Immunogen;
    //序列
    private String sequence;
    //基因ID
    private String geneId;
    //Swiss Prot
    private String swissProt;
    //别名
    private String alias;
    //理论分子量
    private String theoreticalMolecularWeight;
    //实际分子量
    private String actualMolecularWeight;
    //存储缓冲液
    private String storageBuffer;
    //实验方法
    private String experimentalMethod;
    //阳性样本
    private String positiveSample;
    //细胞定位
    private String cellLocation;
    //纯化方式
    private String purificationMethod;
    //研究领域
    private String researchAreas;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StandardTwoInfo info = (StandardTwoInfo) o;
        return Objects.equals(number, info.number) &&
                Objects.equals(itemNumber, info.itemNumber) &&
                Objects.equals(name, info.name) &&
                Objects.equals(revisedName, info.revisedName) &&
                Objects.equals(species, info.species) &&
                Objects.equals(type, info.type) &&
                Objects.equals(verifyApplication, info.verifyApplication) &&
                Objects.equals(reactiveSpecies, info.reactiveSpecies) &&
                Objects.equals(price50ul, info.price50ul) &&
                Objects.equals(price100ul, info.price100ul) &&
                Objects.equals(price200ul, info.price200ul) &&
                Objects.equals(userAuthenticationApplication, info.userAuthenticationApplication) &&
                Objects.equals(recommendedDilutionRatio, info.recommendedDilutionRatio) &&
                Objects.equals(isotype, info.isotype) &&
                Objects.equals(link, info.link) &&
                Objects.equals(background, info.background) &&
                Objects.equals(Immunogen, info.Immunogen) &&
                Objects.equals(sequence, info.sequence) &&
                Objects.equals(geneId, info.geneId) &&
                Objects.equals(swissProt, info.swissProt) &&
                Objects.equals(alias, info.alias) &&
                Objects.equals(theoreticalMolecularWeight, info.theoreticalMolecularWeight) &&
                Objects.equals(actualMolecularWeight, info.actualMolecularWeight) &&
                Objects.equals(storageBuffer, info.storageBuffer) &&
                Objects.equals(experimentalMethod, info.experimentalMethod) &&
                Objects.equals(positiveSample, info.positiveSample) &&
                Objects.equals(cellLocation, info.cellLocation) &&
                Objects.equals(purificationMethod, info.purificationMethod) &&
                Objects.equals(researchAreas, info.researchAreas);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), number, itemNumber, name, revisedName, species, type, verifyApplication, reactiveSpecies, price50ul, price100ul, price200ul, userAuthenticationApplication, recommendedDilutionRatio, isotype, link, background, Immunogen, sequence, geneId, swissProt, alias, theoreticalMolecularWeight, actualMolecularWeight, storageBuffer, experimentalMethod, positiveSample, cellLocation, purificationMethod, researchAreas);
    }

    @Override
    public String toString() {
        return "StandardTwoInfo{" +
                "number='" + number + '\'' +
                ", itemNumber='" + itemNumber + '\'' +
                ", name='" + name + '\'' +
                ", revisedName='" + revisedName + '\'' +
                ", species='" + species + '\'' +
                ", type='" + type + '\'' +
                ", verifyApplication='" + verifyApplication + '\'' +
                ", reactiveSpecies='" + reactiveSpecies + '\'' +
                ", price50ul='" + price50ul + '\'' +
                ", price100ul='" + price100ul + '\'' +
                ", price200ul='" + price200ul + '\'' +
                ", userAuthenticationApplication='" + userAuthenticationApplication + '\'' +
                ", recommendedDilutionRatio='" + recommendedDilutionRatio + '\'' +
                ", isotype='" + isotype + '\'' +
                ", link='" + link + '\'' +
                ", background='" + background + '\'' +
                ", Immunogen='" + Immunogen + '\'' +
                ", sequence='" + sequence + '\'' +
                ", geneId='" + geneId + '\'' +
                ", swissProt='" + swissProt + '\'' +
                ", alias='" + alias + '\'' +
                ", theoreticalMolecularWeight='" + theoreticalMolecularWeight + '\'' +
                ", actualMolecularWeight='" + actualMolecularWeight + '\'' +
                ", storageBuffer='" + storageBuffer + '\'' +
                ", experimentalMethod='" + experimentalMethod + '\'' +
                ", positiveSample='" + positiveSample + '\'' +
                ", cellLocation='" + cellLocation + '\'' +
                ", purificationMethod='" + purificationMethod + '\'' +
                ", researchAreas='" + researchAreas + '\'' +
                '}';
    }
}
