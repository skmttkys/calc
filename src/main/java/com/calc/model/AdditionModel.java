package com.calc.model;
import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;
/**
 * 足し算計算フォームのモデル
 * @author sakamoto
 *
 */
@Data
public class AdditionModel implements Serializable {
	private static final long serialVersionUID = -157143280035400042L;

	/** 答えの配列 */
	@NotEmpty(message = "答えがないよ")
	@Size(max = 500, message = "いいい")
	private Integer[] ansArray;

	/** 正しい答えを計算するための配列 */
	@NotEmpty(message = "なんか変だよ")
	@Size(max = 500, message = "いいい")
	private Integer[] correctArray;


	/** 計算のモード：足し算・引き算など */
	@NotEmpty(message = "あああ")
	@Size(max = 500, message = "いいい")
	private String type;

	/** ゲームのモード：タイムアタックなど */
	@Size(max = 500, message = "いいい")
	private String mode;

	/** ゲームの結果 */
	@Size(max = 500, message = "")
	private String result;

	/** ゲームの結果に付随するメッセージ：正解や残念など */
	@Size(max = 500, message = "")
	private String resultMessage;

	/** ゲームの結果 */
	@Size(max = 500, message = "")
	private String time;
}
