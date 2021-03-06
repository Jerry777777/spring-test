package com.thoughtworks.rslist.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Table(name = "trade")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TradeDto {
    @Id
    @GeneratedValue
    private int id;
    private int rank;
    private int amount;
    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "tradeDto")
    private RsEventDto rsEventDto;
}