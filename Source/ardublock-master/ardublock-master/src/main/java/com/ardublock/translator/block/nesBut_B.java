package com.ardublock.translator.block;

import com.ardublock.translator.Translator;

public class nesBut_B extends TranslatorBlock
{
	public nesBut_B(Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}

	@Override
	public String toCode()
	{
		String ret = "NES_B";
		return codePrefix + ret + codeSuffix;
	}
	
}
