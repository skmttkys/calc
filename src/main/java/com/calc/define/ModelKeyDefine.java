package com.calc.define;

import org.springframework.stereotype.Component;


/**
 *
 * モデルにてセットするkey及びvalueの定義クラス
 * <p>
 * 修正は画面側に影響するので注意
 * </p>
 * @author sakamoto
 *
 */
@Component
public class ModelKeyDefine {
	public static final String GAME_MODE_NORMAL = "NORMAL";

	public static final String GAME_MODE_TIMEATTACK = "TIMEATTACK";

	public static final String GAME_MODE_HARD = "HARD";

	/** 正解時メッセージ */
	public static final String RESULT_MESSAGE_FOR_CORRECT = "だいせいかい";
	/** 不正解時メッセージ */
	public static final String RESULT_MESSAGE_FOR_INCORRECT = "ざんねん";

	public static final String RESULT_FOR_CORRECT = "CORRECT";

	public static final String RESULT_FOR_INCORRECT = "INCORRECT";
}
