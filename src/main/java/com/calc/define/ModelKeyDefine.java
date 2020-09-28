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

	public static final String SHOW_GAME_MODE_NORMAL = "ノーマル";

	public static final String SHOW_GAME_MODE_TIMEATTACK = "タイムアタック";

	public static final String SHOW_GAME_MODE_HARD = "ハード";

	public static final String GAME_CLEAR_TIME＿LABEL = "クリアタイム";

	/** 正解時メッセージ */
	public static final String RESULT_MESSAGE_FOR_CORRECT = "だいせいかい";
	/** 不正解時メッセージ */
	public static final String RESULT_MESSAGE_FOR_INCORRECT = "ざんねん";

	public static final String RESULT_FOR_CORRECT = "CORRECT";

	public static final String RESULT_FOR_INCORRECT = "INCORRECT";

	public static final String ADDITION = "addition";

	public static final String SUBTRACTION = "subtraction";

	public static final String MULTIPLICATION = "multiplication";

	public static final String DIVISION = "division";

	public static final String SHOW_ADDITION = "たしざん";

	public static final String SHOW_SUBTRACTION = "ひきざん";

	public static final String SHOW_MULTIPLICATION = "かけざん";

	public static final String SHOW_DIVISION = "わりざん";
}
