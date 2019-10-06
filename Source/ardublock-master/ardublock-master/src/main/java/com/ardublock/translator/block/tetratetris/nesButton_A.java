package com.ardublock.translator.block.tetratetris;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.TranslatorBlock;


public class nesButton_A extends TranslatorBlock{	
	public nesButton_A(Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}

	@Override
	public String toCode() //throws SocketNullException, SubroutineNotDeclaredException
	{
		String ret = "millis()";
		return codePrefix + ret + codeSuffix;
	}
	
}
