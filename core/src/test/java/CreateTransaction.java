package org.web3j.sample;


import java.util.Scanner;

import Application.java


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Transfer;
import org.web3j.utils.Convert;
import java.math.BigDecimal;



public CreateTransaction {


    Application app;  // app = component of createTransaction. Storing app object reference as createTransaction instance var.

    public CreateTransaction(Application app) {  ///take application object to create transaction.

        this.app = app;
        //create transaction receipt object

        private String recipientAddress;
        private BigDecimal ETHAmountToTransfer;

        private String recipientAddress = scanner.next();
        System.out.print("Enter recipeint ETH address: ");

        private String ETHAmountToTransfer = scanner.next();
        System.out.print("Enter amount in ETH ");


        private String action2 = scanner.next();
        System.out.print("Confirm 'yes' or 'no'. Recipient address: " + recipientAddress + " Amount: " + ETHAmountToTransfer);

        if (action2 == "yes") {
            log.info("Sending Ether ..");
            TransactionReceipt transferReceipt = Transfer.sendFunds(app.web3j, app.credentials, app.recipientAddress, BigDecimal.valueOf(ETHAmountToTransfer), Convert.Unit.ETHER)  // 1 wei = 10^-18 Ether
            .sendAsync().get();
            log.info("Transaction complete : "
            + transferReceipt.getTransactionHash());
        }
        else createTransaction();
    }
}