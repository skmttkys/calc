package com.calc.service;

import com.calc.define.ModelKeyDefine;
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

		String resultMessage = ModelKeyDefine.RESULT_MESSAGE_FOR_CORRECT;

		additionModel.setResultMessage(resultMessage);
		additionModel.setResult(ModelKeyDefine.RESULT_FOR_CORRECT);
		for(int i=0; i<userAnsArray.length; i++){
			if(userAnsArray[i]!=correctAnsArray[i]){
				resultMessage = ModelKeyDefine.RESULT_MESSAGE_FOR_INCORRECT;
				additionModel.setResult(ModelKeyDefine.RESULT_FOR_INCORRECT);
				//答えが一致しなければ間違っている時のメッセージをセットする
				additionModel.setResultMessage(resultMessage);
				break;
			}
		}
	}
}
