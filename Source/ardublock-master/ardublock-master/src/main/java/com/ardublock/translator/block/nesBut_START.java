package com.ardublock.translator.block;

import com.ardublock.translator.Translator;

public class nesBut_START extends TranslatorBlock
{
	public nesBut_START(Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}

	@Override
	public String toCode()
	{
		String ret = "NES_START";
		return codePrefix + ret + codeSuffix;
	}
	
}
