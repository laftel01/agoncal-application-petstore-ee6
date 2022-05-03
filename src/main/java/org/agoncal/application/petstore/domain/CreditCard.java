package org.agoncal.application.petstore.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */

@RequiredArgsConstructor
@EqualsAndHashCode
@Embeddable
public class CreditCard {

    // ======================================
    // =             Attributes             =
    // ======================================

    @Column(name = "credit_card_number", length = 30)
    @NotNull
    @Size(min = 1, max = 30)
    @Getter @Setter private String creditCardNumber;
    @Column(name = "credit_card_type")
    @NotNull
    @Enumerated(EnumType.STRING)
    @EqualsAndHashCode.Exclude
    @Getter @Setter private CreditCardType creditCardType;
    @Column(name = "credit_card_expiry_date", length = 5)
    @NotNull
    @Size(min = 1, max = 5)
    @EqualsAndHashCode.Exclude
    @Getter @Setter private String creditCardExpDate;

    // ======================================
    // =            Constructors            =
    // ======================================

    public CreditCard() {
    }

    // =======================================
    // =           Method toString           =
    // =======================================

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CreditCard");
        sb.append("{creditCardNumber='").append(creditCardNumber).append('\'');
        sb.append(", creditCardType=").append(creditCardType);
        sb.append(", creditCardExpDate='").append(creditCardExpDate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}