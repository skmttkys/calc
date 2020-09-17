package com.calc.service;

import com.calc.model.AdditionModel;

/**
 * 足し算サービス
 * <p>
 * 足し算の動作に関する以下の処理を行います。<br/>
 * ・計算結果確認処理<br/>
 * </p>
 * @author sakamoto
 *
 */
public class AdditionService {

	public void result(AdditionModel additionModel) {

		Integer[] userAnsArray = additionModel.getAnsArray();
		Integer[] correctAnsArray = additionModel.getCorrectArray();

		String resultMessage = "だいせいかい";
		additionModel.setResultMessage(resultMessage);
		for(int i=0; i<userAnsArray.length; i++){
			if(userAnsArray[i]!=correctAnsArray[i]){
				resultMessage = "ざんねん";
				//答えが一致しなければ間違っている時のメッセージをセットする
				additionModel.setResultMessage(resultMessage);
				break;
			}
		}
	}
}
