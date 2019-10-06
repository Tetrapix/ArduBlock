package com.ardublock.translator.block;

import com.ardublock.translator.Translator;

public class nesBut_RIGHT extends TranslatorBlock
{
	public nesBut_RIGHT(Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}

	@Override
	public String toCode()
	{
		String ret = "NES_RIGHT";
		return codePrefix + ret + codeSuffix;
	}
	
}
